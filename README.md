# android-basic-needed-functions
Collection of basic needed functions required for android app development

1. disableTouch(Window window)
	Use this function to disable touch on any activity in android.
	Pass "Window" object of the activity
	
2. enableTouch(Window window)
	Use this function to enable touch once you have disabled using above function
	Pass "Window" object of the activity
	
3. isValidEmail(String email)
	Pass your email string to function
	Function returns true/false
	
4. md5(final String s)
	Pass string to be converted to md5 hash
	Function returns md5 hash
	
	
5. viewVisible(View... views)
	Pass mutliple views seperated by comma to function (Eg: viewVisible(textView, button, editText);
	Return void, change visibility of all views to VISIBILE
	
	
6. viewHidden(View... views)
	Pass mutliple views seperated by comma to function (Eg: viewHidden(textView, button, editText);
	Return void, change visibility of all views to GONE
	
7. viewInvisible(View... views)
	Pass mutliple views seperated by comma to function (Eg: viewInvisible(textView, button, editText);
	Return void, change visibility of all views to INVISIBILE
	
	
8. generateMacId(Context context)
	Pass activity context to function
	Return macId of device
	
9. createHorizontalRecyclerView(Context context, RecyclerView... recyclerViews)
	Pass activity context and recyclerViews seperated by comma
	Return void, changes all recyclerView layout to Horizontal
	
10. startProgressDialog(ProgressDialog dialog, int resourceId)
	Pass ProgressDialog and resourceId (Drawable) to use as progressDialog layout
	Return void, starts showing progress dialog with transaparent background and custom view
	
11. stopProgressDialog(dialog)
	Pass dialog to function
	Return void, stops the dialog
	Note: Pass only dialog which is already running
	
12. formatDateTime(String date, String fromFormat, Strint toFormat)
	Pass your DATE in string format, Current format of DATE String (Eg: dd-MMM-yyyy HH:MM), Required Format of Date string (Eg: dd MM yyyy)
	Return date string in required format
	Note: Can be used for TIME also
	
13. convertFiletoBitmap(File file)
	Pass ImageFile to function
	Return Bitmap
	Note: Default dimension is 200x200 you can change it as per your needed
	
14. setupTabTitleFont(final Context mContext, final TabLayout tabLayout)
	Pass Activity Context and TabLayout (TabLayout should contain tabs)
	Return void
	You will get TextView from Tab for custom styling of textView
	Note: All styling needs to be done in this function itself
	
15. rotateImageView(ImageView iv, float degree)
	Pass ImageView and Rotation degress
	Return void, rotate ImageView to required degrees
	
16. setCustomRatingBarColor(Context mContext, RatingBar rbRating, int colorId)
	Pass Context, RatingBar, ColorID (R.color.colorName)
	Return void
	Changes RatingBar color to color
	Note: Does not work for all AndroidOS version. Works for 5.0+, not tested with below 5.0

17. generateFacebookLoginKey(Context mContext)
	Pass Context
	Return void
	Logs FaceBook hashKey in console
	
	
Stay Tuned for more functions