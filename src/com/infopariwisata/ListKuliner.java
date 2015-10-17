package com.infopariwisata;

import org.json.JSONArray;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class ListKuliner extends ListActivity {
	protected static TextView textView;
	protected static ImageView backmenu, backsplash;
	private Database database;
	private SimpleCursorAdapter mCursorAdapter;
	public static final String EXTRA_ROWID = "rowid";

	ProgressDialog pDialog;
	JSONArray array;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.list_wisata_kuliner);
		
		database = new Database(this);
		database.bukaKoneksi();
		Cursor cursor = database.bacaWisataKuliner();

		startManagingCursor(cursor);
		String[] awal = new String[] { database.FIELD_JUDUL,
				database.FIELD_GAMBAR };
		int[] tujuan = new int[] { R.id.nama1, R.id.gambar1 };
		mCursorAdapter = new SimpleCursorAdapter(this,
				R.layout.item_wisata_kuliner, cursor, awal, tujuan);

		mCursorAdapter.setViewBinder(new SimpleCursorAdapter.ViewBinder() {
			public boolean setViewValue(View view, Cursor cursor,
					int columnIndex) {
				if (columnIndex == database.POSISI_ID) {
					TextView textView = (TextView) view;
					textView.setText("");
					return true;
				}
				return false;
			}
		});

		setListAdapter(mCursorAdapter);
		registerForContextMenu(getListView());

	}

	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		database.tutupKoneksi();
	}

	protected void onListItemClick(ListView l, View v, int position, long rowId) {
		super.onListItemClick(l, v, position, rowId);
		// tampilTempatTerseleksi(rowId);
		detail(position);

	}

	public void tampilTempat(Long mRowId) {
		Cursor cursor = database.bacaDataTerseleksi(mRowId);
		Intent intent = new Intent(this, KetWisata.class);
		intent.putExtra("judul", cursor.getString(Database.POSISI_JUDUL));
		intent.putExtra("deskripsi",
				cursor.getString(database.POSISI_DESKRIPSI));
		intent.putExtra("gambar", cursor.getBlob(database.POSISI_GAMBAR));

		startActivity(intent);

	}

	public void detail(int position) {
		Cursor cursor = database.bacaWisataKuliner();
		int im = 0;
		String _id = "";
		String judul = "";
		String deskripsi = "";

		if (cursor.moveToFirst()) {
			cursor.moveToPosition(position);
			im = cursor.getInt(cursor.getColumnIndex("gambar"));
			judul = cursor.getString(cursor.getColumnIndex("judul"));
			deskripsi = cursor.getString(cursor.getColumnIndex("deskripsi"));

		}

		Intent iIntent = new Intent(this, KetWisata.class);
		iIntent.putExtra("dataIM", im);
		iIntent.putExtra("judul", judul);
		iIntent.putExtra("deskripsi", deskripsi);

		setResult(RESULT_OK, iIntent);
		startActivityForResult(iIntent, 99);
	}

}
