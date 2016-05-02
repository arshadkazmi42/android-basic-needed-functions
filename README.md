# android-basic-needed-functions
Collection of basic needed functions required for android app development

1. disableTouch(Window window)<br>
	Use this function to disable touch on any activity in android.<br>
	Pass "Window" object of the activity<br>
	
2. enableTouch(Window window)<br>
	Use this function to enable touch once you have disabled using above function<br>
	Pass "Window" object of the activity<br>
	
3. isValidEmail(String email)<br>
	Pass your email string to function<br>
	Function returns true/false<br>
	
4. md5(final String s)<br>
	Pass string to be converted to md5 hash<br>
	Function returns md5 hash<br>
	
	
5. viewVisible(View... views)<br>
	Pass mutliple views seperated by comma to function (Eg: viewVisible(textView, button, editText);<br>
	Return void, change visibility of all views to VISIBILE<br>
	
	
6. viewHidden(View... views)<br>
	Pass mutliple views seperated by comma to function (Eg: viewHidden(textView, button, editText);<br>
	Return void, change visibility of all views to GONE<br>
	
7. viewInvisible(View... views)<br>
	Pass mutliple views seperated by comma to function (Eg: viewInvisible(textView, button, editText);<br>
	Return void, change visibility of all views to INVISIBILE<br>
	
	
8. generateMacId(Context context)<br>
	Pass activity context to function<br>
	Return macId of device<br>
	
9. createHorizontalRecyclerView(Context context, RecyclerView... recyclerViews)<br>
	Pass activity context and recyclerViews seperated by comma<br>
	Return void, changes all recyclerView layout to Horizontal<br>
	
10. startProgressDialog(ProgressDialog dialog, int resourceId)<br>
	Pass ProgressDialog and resourceId (Drawable) to use as progressDialog layout<br>
	Return void, starts showing progress dialog with transaparent background and custom view<br>
	
11. stopProgressDialog(dialog)<br>
	Pass dialog to function<br>
	Return void, stops the dialog<br>
	Note: Pass only dialog which is already running<br>
	
12. formatDateTime(String date, String fromFormat, Strint toFormat)<br>
	Pass your DATE in string format, Current format of DATE String (Eg: dd-MMM-yyyy HH:MM), Required Format of Date string (Eg: dd MM yyyy)<br>
	Return date string in required format<br>
	Note: Can be used for TIME also<br>
	
13. convertFiletoBitmap(File file)<br>
	Pass ImageFile to function<br>
	Return Bitmap<br>
	Note: Default dimension is 200x200 you can change it as per your needed<br>
	
14. setupTabTitleFont(final Context mContext, final TabLayout tabLayout)<br>
	Pass Activity Context and TabLayout (TabLayout should contain tabs)<br>
	Return void<br>
	You will get TextView from Tab for custom styling of textView<br>
	Note: All styling needs to be done in this function itself<br>
	
15. rotateImageView(ImageView iv, float degree)<br>
	Pass ImageView and Rotation degress<br>
	Return void, rotate ImageView to required degrees<br>

16. setCustomRatingBarColor(Context mContext, RatingBar rbRating, int colorId)<br>
	Pass Context, RatingBar, ColorID (R.color.colorName)<br>
	Return void<br>
	Changes RatingBar color to color<br>
	Note: Does not work for all AndroidOS version. Works for 5.0+, not tested with below 5.0<br>

17. generateFacebookLoginKey(Context mContext)<br>
	Pass Context<br>
	Return void<br>
	Logs FaceBook hashKey in console<br>
	
18. encodeToBase64(Bitmap image)<br>
	Pass Bitmap<br>
	Return base64 string<br>
	
19. decodeBase64(String base64)<br>
	Pass base64 string<br>
	Return bitmap<br>
	
20. isAppInstalled(String packageName, Context context)<br>
	Pass App Package Name and Context<br>
	Returns boolean true/false<br>
	
	
Stay Tuned for more functions


<br><br><b>SharedPreferences Handler</b><br>

Use SharedPrefs file for SharedPrefs storing and fetching<br>
1. Store and fetch String, Integer, Boolean, Float value to and from SharedPreferences<br>
2. Remove Data from SharedPreferences for particular key<br>
3. Clear Complete SharedPreferences<br><br>

Note: Change app_name to your app package name in sharedPrefs file<br>
