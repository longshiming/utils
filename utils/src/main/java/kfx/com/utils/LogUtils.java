
package kfx.com.utils;

import android.util.Log;


public class LogUtils {

    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_WARN = 4;
    public static final int LEVEL_ERROR = 5;

    private static final int LOG_TAG = 0;

    public static void v(String tag, String msg) {
        if (LEVEL_VERBOSE > LOG_TAG) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LEVEL_DEBUG > LOG_TAG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LEVEL_INFO > LOG_TAG) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LEVEL_WARN > LOG_TAG) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LEVEL_ERROR > LOG_TAG) {
            Log.e(tag, msg);
        }
    }

}
