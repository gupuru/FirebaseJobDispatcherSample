package com.gupuru.firebasejobdispatchersample

import android.util.Log
import com.firebase.jobdispatcher.JobParameters
import com.firebase.jobdispatcher.JobService
import com.firebase.jobdispatcher.SimpleJobService

/**
 * Created by kohei on 2017/01/04.
 */
class SimpleJobService : SimpleJobService() {
    override fun onRunJob(job: JobParameters?): Int {
        Log.d("ここ", "SimpleJobService")

        return JobService.RESULT_SUCCESS
    }

}