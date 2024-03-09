package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myapplication.MainActivity;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static DatabaseHelper instance;
    public static final String DATABASE_NAME = "pizzastack123";
    public static final int DATABASE_VERSION = 4;
    public static final String TABLE_NAME = "urunler";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_URUN_ADI = "urunAdi";
    public static final String COLUMN_URUN_ACK = "urunAciklama";
    public static final String COLUMN_URUN_FIYAT = "urunFiyat";

    public static final String TABLE_YANURUN = "Yanurunler";

    public static final String YANURUN_ID = "ID";

    public static final String YANURUN_ADI = "YanurunAdi";
    public static final String YANURUN_FIYAT = "YanurunFiyat";




    public static final String TABLE_USER = "users";

    public static final String ID_USER = "userID";
    public static final String USERNAME_USER = "username";
    public static final String PASSWORD_USER = "password";
    public static final String PHONE_USER = "phone";
    public static final String ADRES_USER = "adres";
    public static final String EMAIL_USER = "email";


    public DatabaseHelper(MainActivity  context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public static synchronized DatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseHelper((MainActivity) context);
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_URUN_ADI + " TEXT, " +
                COLUMN_URUN_ACK + " TEXT, " +
                COLUMN_URUN_FIYAT + " INTEGER)";
        db.execSQL(createTableQuery);


        db.execSQL("INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_ID + ", " +
                COLUMN_URUN_ADI + ", " +
                COLUMN_URUN_ACK + ", " +
                COLUMN_URUN_FIYAT + ") VALUES ('1', 'Pepperoni', 'Pepperoni sucuğu ve mozarella peyniri ile özel baharatlanmış orta boy pizza','190 TL')");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_ID + ", " +
                COLUMN_URUN_ADI + ", " +
                COLUMN_URUN_ACK + ", " +
                COLUMN_URUN_FIYAT + ") VALUES ('2', 'Festival', 'Sucuk, charliston biber, mozarella peyniri, mısır,zeytin ve mantarlı orta boy pizza','190 TL')");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_ID + ", " +
                COLUMN_URUN_ADI + ", " +
                COLUMN_URUN_ACK + ", " +
                COLUMN_URUN_FIYAT + ") VALUES ('3', 'SebzeSever', 'Charliston biber,domates, mısır, mantar, mozarella peyniri ve zeytinli orta boy vegan pizza','190 TL')");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_ID + ", " +
                COLUMN_URUN_ADI + ", " +
                COLUMN_URUN_ACK + ", " +
                COLUMN_URUN_FIYAT + ") VALUES ('4', 'XXL Menü', '1 adet büyük boy festival pizza, 1 adet kola, 2 adet biscuit, soğan halkası, patates kızartması ','250 TL')");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_ID + ", " +
                COLUMN_URUN_ADI + ", " +
                COLUMN_URUN_ACK + ", " +
                COLUMN_URUN_FIYAT + ") VALUES ('5', 'Donatello Menü', '1 Adet büyük boy festival pizza, 1 adet kola, 1 adet sufle, patates kızartması ','250 TL')");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_ID + ", " +
                COLUMN_URUN_ADI + ", " +
                COLUMN_URUN_ACK + ", " +
                COLUMN_URUN_FIYAT + ") VALUES ('6', 'Raphael Menü', '1 Adet büyük boy festival pizza, 1 adet kutu kola, 1 adet mozaik pasta, patates kızartması ','250 TL')");



        String createTableQueryYANURUN = "CREATE TABLE " + TABLE_YANURUN + " (" +
                YANURUN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                YANURUN_ADI + " TEXT, " +
                YANURUN_FIYAT+ " TEXT)";
        db.execSQL(createTableQueryYANURUN);


        db.execSQL("INSERT INTO " + TABLE_YANURUN + " (" +
                YANURUN_ID + ", " +
                YANURUN_ADI+ ", " +
                YANURUN_FIYAT + ") VALUES ('1', '4 Adet chicken tenders','25 TL')");

        db.execSQL("INSERT INTO " + TABLE_YANURUN + " (" +
                YANURUN_ID + ", " +
                YANURUN_ADI+ ", " +
               YANURUN_FIYAT + ") VALUES ('2', '6 Adet nugget','25 TL')");
        db.execSQL("INSERT INTO " + TABLE_YANURUN + " (" +
                YANURUN_ID + ", " +
                YANURUN_ADI+ ", " +
                YANURUN_FIYAT + ") VALUES ('3', 'Sufle','35 TL')");

        db.execSQL("INSERT INTO " + TABLE_YANURUN + " (" +
                YANURUN_ID + ", " +
                YANURUN_ADI+ ", " +
                YANURUN_FIYAT + ") VALUES ('4', 'Mozaik','35 TL')");

        String createTableQueryUser = "CREATE TABLE " + TABLE_USER + " (" +
                ID_USER + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                USERNAME_USER + " TEXT, " +
                PASSWORD_USER + " TEXT, " +
                PHONE_USER + " TEXT, " +
                ADRES_USER + " TEXT, " +
                EMAIL_USER + " TEXT)";
        db.execSQL(createTableQueryUser);



        db.execSQL("INSERT INTO " + TABLE_USER + " (" +
                ID_USER + ", " +
                USERNAME_USER + ", " +
                PASSWORD_USER + ", " +
                PHONE_USER + ", " +
                ADRES_USER+ ", " +
                EMAIL_USER + ") VALUES ('1', 'kubr', 'kubr123456', '05453555238','istanbul','kubr@yokmail.com')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }



    public boolean addUser(String username, String password, String email, String phone, String adres) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USERNAME_USER, username);
        values.put(PASSWORD_USER, password);
        values.put(EMAIL_USER, email);
        values.put(PHONE_USER, phone );
        values.put(ADRES_USER, adres);

        long result = db.insert(TABLE_USER, null, values);
        db.close();
        return result != -1;
    }

    public boolean kullaniciGiris(String kullaniciAdi, String sifre) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = { DatabaseHelper.USERNAME_USER, DatabaseHelper.PASSWORD_USER, DatabaseHelper.EMAIL_USER };
        String selection = DatabaseHelper.USERNAME_USER + " = ?" + " AND " + DatabaseHelper.PASSWORD_USER + " = ?";
        String[] selectionArgs = { kullaniciAdi, sifre };

        Cursor cursor = db.query(DatabaseHelper.TABLE_USER, columns, selection, selectionArgs, null, null, null);

        int count = cursor.getCount();
        cursor.close();
        db.close();

        return count > 0;
    }


}


