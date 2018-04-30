# Class11_SharedPreferenceDemo
SharedPreferenceDemo

儲存使用者偏好設定

SharedPreferences settings = getSharedPreferences(FILENAME,MODE_PRIVATE);
SharedPreferences.Editor editor = settings.edit();
editor.putxxx();
......
commit();

Shared Preference
1.偏好設定是用來儲存使用者相關的設定
	通常只會用來儲存小量的資料
	大量的資料會儲存在內存(Internal Storage)
	或外存(External Storage)

2.要儲存偏好設定，要先取得SharedPreferene 物件
	取得的方法如下:
	a. getSharedPreferences(), 可以讓你儲存多個偏好設定檔
		所以參數要給檔名
	b. getPreferences(), 預設以 Activity 的類別名稱為檔名，所以只能有一個檔名

3.寫入資料
	用SharedPreferences 物件,呼叫 edit(),會回傳 SharedPreferences.Editer 物件，
	再使用此物件呼叫 putxxx() 方法，存入資料，最後呼叫 commit() 的儲存動作

4.讀取資料
	用SharedPreference 物件，呼叫 getxxx() 方法，來讀取資料

5.一般會利用 Activity 的生命週期在讀寫資料

6.儲存模式(mode)
	MODE_PRIVATE: 建新檔案
	MODE_APPEND: 附加檔案
  
  
