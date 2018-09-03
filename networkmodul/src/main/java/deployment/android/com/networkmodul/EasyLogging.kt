package deployment.android.com.networkmodul

import android.content.Context
import android.util.Log
import android.widget.Toast

class EasyLogging {

    companion object {
        val TAG = "EasyLogging"

        fun d(message: String) {
            Log.d(TAG, message)
        }

        fun toast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}