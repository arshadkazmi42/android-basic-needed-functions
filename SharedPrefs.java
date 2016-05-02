import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Arshad on 02-05-2016.
 */
public class SharedPrefs {

    private static final String app_name = "SharedPrefsMak"; //Change Name to your app package name

    /**
     * Storing string value into SharedPrefs
     *
     * @param c
     * @param key
     * @param value
     */
    public static void setSharedPrefs(Context c, String key, String value) {

        SharedPreferences.Editor editor = c.getSharedPreferences(app_name,
                Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.apply();

    }

    /**
     * Storing int value into SharedPrefs
     *
     * @param c
     * @param key
     * @param value
     */
    public static void setSharedPrefs(Context c, String key, int value) {

        SharedPreferences.Editor editor = c.getSharedPreferences(app_name,
                Context.MODE_PRIVATE).edit();
        editor.putInt(key, value);
        editor.apply();

    }

    /**
     * Storing float value into SharedPrefs
     *
     * @param c
     * @param key
     * @param value
     */
    public static void setSharedPrefs(Context c, String key, float value) {

        SharedPreferences.Editor editor = c.getSharedPreferences(app_name,
                Context.MODE_PRIVATE).edit();
        editor.putFloat(key, value);
        editor.apply();

    }

    /**
     * Storing float value into SharedPrefs
     *
     * @param c
     * @param key
     * @param value
     */
    public static void setSharedPrefs(Context c, String key, boolean value) {

        SharedPreferences.Editor editor = c.getSharedPreferences(app_name,
                Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.apply();

    }

    /**
     * Fetching boolean value from SharedPrefs
     * @param c
     * @param key
     * @param defaultValue
     * @return
     */
    public static boolean getSharedPrefs(Context c, String key, boolean defaultValue){
        if (c == null) {
            return defaultValue;
        } else {
            SharedPreferences prefs = c.getSharedPreferences(app_name,
                    Context.MODE_PRIVATE);
            return prefs.getBoolean(key, defaultValue);
        }
    }

    /**
     * Fetching float value from SharedPrefs
     *
     * @param c
     * @param key
     * @param defaultValue
     * @return
     */
    public static float getSharedPrefs(Context c, String key, float defaultValue) {
        if (c == null) {
            return defaultValue;
        } else {
            SharedPreferences prefs = c.getSharedPreferences(app_name,
                    Context.MODE_PRIVATE);
            return prefs.getFloat(key, defaultValue);
        }
    }

    /**
     * Fetching String value from SharedPrefs
     *
     * @param c
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getSharedPrefs(Context c, String key,
                                        String defaultValue) {
        if (c == null) {
            return defaultValue;
        } else {
            SharedPreferences prefs = c.getSharedPreferences(app_name,
                    Context.MODE_PRIVATE);
            return prefs.getString(key, defaultValue);
        }
    }

    /**
     * Fetching int value from SharedPrefs
     *
     * @param c
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getSharedPrefs(Context c, String key, int defaultValue) {
        if (c == null) {
            return defaultValue;
        } else {
            SharedPreferences prefs = c.getSharedPreferences(app_name,
                    Context.MODE_PRIVATE);
            return prefs.getInt(key, defaultValue);
        }
    }

    /**
     * Checking if SharedPrefs contains key
     *
     * @param c
     * @param key
     * @return
     */
    public static boolean checkSharedPrefs(Context c, String key) {
        if (c == null) {
            return false;
        } else {
            SharedPreferences prefs = c.getSharedPreferences(app_name,
                    Context.MODE_PRIVATE);
            return prefs.contains(key);
        }
    }

    /**
     * Removing from SharedPrefs
     *
     * @param c
     * @param key
     */
    public static void removeSharedPrefs(Context c, String key) {
        SharedPreferences.Editor editor = c.getSharedPreferences(app_name,
                Context.MODE_PRIVATE).edit();
        editor.remove(key);
        editor.apply();
    }


    /**
     * Clear SharedPrefs
     *
     * @param c
     */
    public static void clearSharedPrefs(Context c) {
        SharedPreferences.Editor editor = c.getSharedPreferences(app_name,
                Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.apply();
    }


}
