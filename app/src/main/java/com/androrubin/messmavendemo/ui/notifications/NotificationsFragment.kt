package com.androrubin.messmavendemo.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.androrubin.messmavendemo.MainActivity
import com.androrubin.messmavendemo.R
import com.androrubin.messmavendemo.databinding.FragmentNotificationsBinding
import com.androrubin.messmavendemo.on_boarding.LoginActivity
import com.github.anastr.speedviewlib.Gauge
import com.google.firebase.auth.FirebaseAuth

class NotificationsFragment : Fragment() {

    private lateinit var mAuth: FirebaseAuth
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        mAuth = FirebaseAuth.getInstance()
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val tubeSpeedometer = binding.tubeSpeedometer

// change MAX speed to 320
        tubeSpeedometer.maxSpeed = 320f
// change speed to 140 Km/h
        tubeSpeedometer.speedTo(140f)
        tubeSpeedometer.withTremble=false
        tubeSpeedometer.speedTextColor = getActivity()?.getResources()!!.getColor(android.R.color.white, getActivity()?.getTheme())
        tubeSpeedometer.speedTextSize = 0f

        val tubeSpeedometer2 = binding.tubeSpeedometer2

// change MAX speed to 320
        tubeSpeedometer2.maxSpeed = 320f
// change speed to 240 Km/h
        tubeSpeedometer2.speedTo(240f)
        tubeSpeedometer2.withTremble=false
        tubeSpeedometer2.speedTextColor = getActivity()?.getResources()!!.getColor(android.R.color.white, getActivity()?.getTheme())
        tubeSpeedometer2.speedTextSize = 0f

        binding.button.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(activity,LoginActivity::class.java))
            finishAffinity(MainActivity())
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}