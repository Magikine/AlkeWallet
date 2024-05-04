package marjorie.moya.elgueta

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginSignupPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_signup_page)
        //Vamos a declarar los botones para la interaccion
        val btn_2 = findViewById<ImageView>(R.id.btn_pg2)
        btn_2.setOnClickListener {
            val abrirpantallacuatro = Intent(this, SignupPageActivity::class.java)
            startActivity(abrirpantallacuatro)
        }
            // finish()

                // finish()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}