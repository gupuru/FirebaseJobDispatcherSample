package com.gupuru.firebasejobdispatchersample

import android.util.Log
import com.firebase.jobdispatcher.JobParameters
import com.firebase.jobdispatcher.JobService


class MyJobService : JobService() {

    override fun onStartJob(job: JobParameters): Boolean {

        Log.d("ここ", "onStartJob")

        return false
    }

    override fun onStopJob(job: JobParameters): Boolean {
        Log.d("ここ", "onStopJob")

        return false
    }
}