package deployment.android.com.networkmodul

import android.util.Log

class EasyLogging {

    companion object {
        val TAG = "EasyLogging"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}