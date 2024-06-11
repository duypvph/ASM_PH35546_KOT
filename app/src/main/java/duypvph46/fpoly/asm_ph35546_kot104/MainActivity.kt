package duypvph46.fpoly.asm_ph35546_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScreenNavigation()
//            Home(navController = null)
//            MyBottombar()
//            ProductDetail()
//            Cart()
//            CheckOut()
//            Congrats()
        }
    }
}