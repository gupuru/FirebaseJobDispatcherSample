package com.gupuru.firebasejobdispatchersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.firebase.jobdispatcher.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main.button_start.setOnClickListener {
            Log.d("ここ", "setOnClickListener")
            val dispatcher = FirebaseJobDispatcher(GooglePlayDriver(this@MainActivity))
            val myJob = dispatcher.newJobBuilder()
                    .setService(SimpleJobService::class.java)
                    .setTag("aaaaaaaaaaaaaa")
                    .setTrigger(Trigger.NOW)
                    .setRetryStrategy(RetryStrategy.DEFAULT_EXPONENTIAL)
                    .setConstraints(Constraint.ON_ANY_NETWORK)
                    .build()

            dispatcher.mustSchedule(myJob)
        }

    }

    override fun onStop() {
        super.onStop()
    }

}