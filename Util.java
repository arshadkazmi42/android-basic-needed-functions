import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util{

    /**
     * Disable screen touch
     *
     * @param window
     */
    public static void disableTouch(Window window) {
        window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

    /**
     * Enable screen touch
     *
     * @param window
     */
    public static void enableTouch(Window window) {
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

    /**
     * Validate Email
     *
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }



    /**
     * md5 token generation
     *
     * @param s
     * @return
     */
    public static String md5(final String s) {
        final String MD5 = "MD5";
        try {
            MessageDigest digest = MessageDigest.getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }



    /**
     * Make View Visible
     *
     * @param views
     */
    public static void viewVisible(View... views) {
        for (View view : views) {
            view.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Make View Hidden
     *
     * @param views
     */
    public static void viewHidden(View... views) {
        for (View view : views) {
            view.setVisibility(View.GONE);
        }
    }

    /**
     * Make View Invisible
     *
     * @param views
     */
    public static void viewInvisible(View... views) {
        for (View view : views) {
            view.setVisibility(View.INVISIBLE);
        }
    }



    /**
     * Generating macId
     *
     * @param context
     */
    public static String generateMacId(Context context) {
        WifiManager manager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = manager.getConnectionInfo();
        return info.getMacAddress();
    }


    /**
     * Creating HorizontalLayout for RecyclerView
     *
     * @param mContext
     * @param recyclerViews
     */
    public static void createHorizontalRecyclerView(Context mContext, RecyclerView... recyclerViews) {
        for (RecyclerView recyclerView : recyclerViews) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        }
    }



    /**
     * Start ProgressDialog loading
     * ProgressDialog with transparent background
     *
     * @param dialog
     * @param message
     * @param resourceId - Resource ID of the Layout
     */
    public static void startProgressDialog(ProgressDialog dialog, int resourceId) {
        dialog.setMessage("");
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        dialog.setContentView(resourceId);
    }



    /**
     * Stop progress dialog loadding
     *
     * @param dialog
     */
    public static void stopProgressDialog(ProgressDialog dialog) {
        dialog.dismiss();
    }



    /**
     * Formatting data-time from custom format to custom format
     *
     * @param date - Date in string format
     * @param fromFormat - Existing format of date (Eg: dd-MMM-yyyy HH:MM)
     * @param toFormat - Required date format (Eg: dd MM yyyy)
     * @return
     */
    public static String formatDateTime(String date, String fromFormat, String toFormat) {
        Date d = null;
        try {
            d = new SimpleDateFormat(fromFormat, Locale.US).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat(toFormat, Locale.US).format(d);
    }


    /**
     * Convert Image File to Bitmap
     * Dimension 200x200
     * @param file
     * @return
     */
    public static Bitmap convertFiletoBitmap(File file) {
        String filePath = file.getPath();
        Bitmap bitmap = BitmapFactory.decodeFile(filePath);
        bitmap = Bitmap.createScaledBitmap(bitmap, 200, 200, false); //Change the dimension 200 to your required dimension
        return bitmap;
    }




    /**
     * Apply custom theme to TabLayout - Tab text
     *
     * @param mContext
     * @param tabLayout
     */
    public static void setupTabTitleFont(final Context mContext, final TabLayout tabLayout) {
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    TextView textView = (TextView) tabViewChild;
                    //Apply all your custom features to title textView
                }
            }
        }
    }



    /**
     * Rotate image to given degrees
     *
     * @param iv
     * @param degree
     */
    public static void rotateImageView(ImageView iv, float degree) {
        Matrix matrix = new Matrix();
        iv.setScaleType(ImageView.ScaleType.MATRIX);   //required
        iv.setRotation(degree);
        iv.setImageMatrix(matrix);
    }




    /**
     * Setting Custom RatingBar Color
     *
     * @param mContext
     * @param rbRating
     */
    public static void setCustomRatingBarColor(Context mContext, RatingBar rbRating, int colorId) {
        LayerDrawable layerDrawable = (LayerDrawable) rbRating.getProgressDrawable();
        DrawableCompat.setTint(DrawableCompat.wrap(layerDrawable.getDrawable(0)), ContextCompat.getColor(mContext, colorId));   // Empty star
        DrawableCompat.setTint(DrawableCompat.wrap(layerDrawable.getDrawable(1)), ContextCompat.getColor(mContext, colorId)); // Partial star
        DrawableCompat.setTint(DrawableCompat.wrap(layerDrawable.getDrawable(2)), ContextCompat.getColor(mContext, colorId));
    }




    /**
     * Generating facebook hash key
     *
     * @param mContext
     */
    public static void generateFacebookLoginKey(Context mContext) {
        String packageName = ""; //add your package name here - required
        try {
            PackageInfo info = mContext.getPackageManager().getPackageInfo(packageName, PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String sign = Base64.encodeToString(md.digest(), Base64.DEFAULT);
                Log.e("MY KEY HASH:", sign);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("Util", e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            Log.e("Util", e.getMessage());
        }

    }
	
	/**
	* Encode Bitmap file to base64
	* @param image
	*/
	public static String encodeTobase64(Bitmap image){
        Bitmap immagex=image;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        immagex.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);
        return imageEncoded;
    }
	
	
	/**
	* Decode base64 to Bitmap
	* @param input
	*/
    public static Bitmap decodeBase64(String input){
        byte[] decodedByte = Base64.decode(input, 0);
        return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
    }


}