package com.example.imtryingdawg

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import retrofit2.Response

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.imtryingdawg", appContext.packageName)
    }


    @Test
    fun testDoubler() {
        // Context of the app under test.
        val service = RetrofitUtil.get()
        val response : Response<Int> = service.truc(4).execute()
        val valeur : Int? = response.body()
        assertEquals(valeur, 8)
    }
}