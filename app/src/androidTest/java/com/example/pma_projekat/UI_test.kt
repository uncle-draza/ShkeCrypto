package com.example.pma_projekat


import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class UI_test {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(SignInActivity::class.java)

    @Test
    fun uI_test() {
        val appCompatEditText = onView(
            allOf(
                withId(R.id.emailET),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("dilpdrazovic@gmail.co"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.pswdET),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(replaceText("dragoljub123"), closeSoftKeyboard())

        val appCompatEditText3 = onView(
            allOf(
                withId(R.id.pswdET), withText("dragoljub123"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText3.perform(pressImeActionButton())

        val appCompatButton = onView(
            allOf(
                withId(R.id.button), withText("Sign in"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        appCompatButton.perform(click())

        val recyclerView = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView.perform(actionOnItemAtPosition<ViewHolder>(0, click()))

        pressBack()

        val recyclerView2 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView2.perform(actionOnItemAtPosition<ViewHolder>(1, click()))

        pressBack()

        val recyclerView3 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView3.perform(actionOnItemAtPosition<ViewHolder>(2, click()))

        pressBack()

        val recyclerView4 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView4.perform(actionOnItemAtPosition<ViewHolder>(3, click()))

        pressBack()

        val recyclerView5 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView5.perform(actionOnItemAtPosition<ViewHolder>(4, click()))

        pressBack()

        val recyclerView6 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView6.perform(actionOnItemAtPosition<ViewHolder>(5, click()))

        pressBack()

        val recyclerView7 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView7.perform(actionOnItemAtPosition<ViewHolder>(6, click()))

        pressBack()

        val recyclerView8 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView8.perform(actionOnItemAtPosition<ViewHolder>(7, click()))

        pressBack()

        val recyclerView9 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView9.perform(actionOnItemAtPosition<ViewHolder>(8, click()))

        pressBack()

        val recyclerView10 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView10.perform(actionOnItemAtPosition<ViewHolder>(9, click()))

        pressBack()

        val recyclerView11 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView11.perform(actionOnItemAtPosition<ViewHolder>(10, click()))

        pressBack()

        val recyclerView12 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView12.perform(actionOnItemAtPosition<ViewHolder>(11, click()))

        pressBack()

        val recyclerView13 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView13.perform(actionOnItemAtPosition<ViewHolder>(12, click()))

        pressBack()

        val recyclerView14 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView14.perform(actionOnItemAtPosition<ViewHolder>(13, click()))

        pressBack()

        val recyclerView15 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView15.perform(actionOnItemAtPosition<ViewHolder>(14, click()))

        pressBack()

        val recyclerView16 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView16.perform(actionOnItemAtPosition<ViewHolder>(15, click()))

        pressBack()

        val recyclerView17 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView17.perform(actionOnItemAtPosition<ViewHolder>(16, click()))

        pressBack()

        val recyclerView18 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView18.perform(actionOnItemAtPosition<ViewHolder>(17, click()))

        pressBack()

        val recyclerView19 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView19.perform(actionOnItemAtPosition<ViewHolder>(18, click()))

        pressBack()

        val recyclerView20 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView20.perform(actionOnItemAtPosition<ViewHolder>(19, click()))

        pressBack()

        val recyclerView21 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView21.perform(actionOnItemAtPosition<ViewHolder>(20, click()))

        pressBack()

        val recyclerView22 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView22.perform(actionOnItemAtPosition<ViewHolder>(21, click()))

        pressBack()

        val recyclerView23 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView23.perform(actionOnItemAtPosition<ViewHolder>(22, click()))

        pressBack()

        val recyclerView24 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView24.perform(actionOnItemAtPosition<ViewHolder>(23, click()))

        pressBack()

        val recyclerView25 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView25.perform(actionOnItemAtPosition<ViewHolder>(24, click()))

        pressBack()

        val recyclerView26 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView26.perform(actionOnItemAtPosition<ViewHolder>(25, click()))

        pressBack()

        val recyclerView27 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView27.perform(actionOnItemAtPosition<ViewHolder>(26, click()))

        pressBack()

        val recyclerView28 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView28.perform(actionOnItemAtPosition<ViewHolder>(27, click()))

        pressBack()

        val recyclerView29 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView29.perform(actionOnItemAtPosition<ViewHolder>(28, click()))

        pressBack()

        val recyclerView30 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView30.perform(actionOnItemAtPosition<ViewHolder>(29, click()))

        pressBack()

        val recyclerView31 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView31.perform(actionOnItemAtPosition<ViewHolder>(30, click()))

        pressBack()

        val recyclerView32 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView32.perform(actionOnItemAtPosition<ViewHolder>(31, click()))

        pressBack()

        val recyclerView33 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView33.perform(actionOnItemAtPosition<ViewHolder>(32, click()))

        pressBack()

        val recyclerView34 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView34.perform(actionOnItemAtPosition<ViewHolder>(33, click()))

        pressBack()

        val recyclerView35 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView35.perform(actionOnItemAtPosition<ViewHolder>(34, click()))

        pressBack()

        val recyclerView36 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView36.perform(actionOnItemAtPosition<ViewHolder>(34, click()))

        pressBack()

        val recyclerView37 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView37.perform(actionOnItemAtPosition<ViewHolder>(35, click()))

        pressBack()

        val recyclerView38 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView38.perform(actionOnItemAtPosition<ViewHolder>(36, click()))

        pressBack()

        val recyclerView39 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView39.perform(actionOnItemAtPosition<ViewHolder>(37, click()))

        pressBack()

        val recyclerView40 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView40.perform(actionOnItemAtPosition<ViewHolder>(38, click()))

        pressBack()

        val recyclerView41 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView41.perform(actionOnItemAtPosition<ViewHolder>(39, click()))

        pressBack()

        val recyclerView42 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView42.perform(actionOnItemAtPosition<ViewHolder>(40, click()))

        pressBack()

        val recyclerView43 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView43.perform(actionOnItemAtPosition<ViewHolder>(41, click()))

        pressBack()

        val recyclerView44 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView44.perform(actionOnItemAtPosition<ViewHolder>(42, click()))

        pressBack()

        val recyclerView45 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView45.perform(actionOnItemAtPosition<ViewHolder>(43, click()))

        pressBack()

        val recyclerView46 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView46.perform(actionOnItemAtPosition<ViewHolder>(44, click()))

        pressBack()

        val recyclerView47 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView47.perform(actionOnItemAtPosition<ViewHolder>(45, click()))

        pressBack()

        val recyclerView48 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView48.perform(actionOnItemAtPosition<ViewHolder>(46, click()))

        pressBack()

        val recyclerView49 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView49.perform(actionOnItemAtPosition<ViewHolder>(47, click()))

        pressBack()

        val recyclerView50 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView50.perform(actionOnItemAtPosition<ViewHolder>(48, click()))

        pressBack()

        val recyclerView51 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView51.perform(actionOnItemAtPosition<ViewHolder>(49, click()))

        pressBack()

        val recyclerView52 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView52.perform(actionOnItemAtPosition<ViewHolder>(50, click()))

        pressBack()

        val recyclerView53 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView53.perform(actionOnItemAtPosition<ViewHolder>(51, click()))

        pressBack()

        val recyclerView54 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView54.perform(actionOnItemAtPosition<ViewHolder>(52, click()))

        pressBack()

        val recyclerView55 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView55.perform(actionOnItemAtPosition<ViewHolder>(53, click()))

        pressBack()

        val recyclerView56 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView56.perform(actionOnItemAtPosition<ViewHolder>(54, click()))

        pressBack()

        val recyclerView57 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView57.perform(actionOnItemAtPosition<ViewHolder>(55, click()))

        pressBack()

        val recyclerView58 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView58.perform(actionOnItemAtPosition<ViewHolder>(56, click()))

        pressBack()

        val recyclerView59 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView59.perform(actionOnItemAtPosition<ViewHolder>(57, click()))

        pressBack()

        val recyclerView60 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView60.perform(actionOnItemAtPosition<ViewHolder>(58, click()))

        pressBack()

        val recyclerView61 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView61.perform(actionOnItemAtPosition<ViewHolder>(59, click()))

        pressBack()

        val recyclerView62 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView62.perform(actionOnItemAtPosition<ViewHolder>(60, click()))

        pressBack()

        val recyclerView63 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView63.perform(actionOnItemAtPosition<ViewHolder>(61, click()))

        pressBack()

        val recyclerView64 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView64.perform(actionOnItemAtPosition<ViewHolder>(62, click()))

        pressBack()

        val recyclerView65 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView65.perform(actionOnItemAtPosition<ViewHolder>(62, click()))

        pressBack()

        val recyclerView66 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView66.perform(actionOnItemAtPosition<ViewHolder>(63, click()))

        pressBack()

        val recyclerView67 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView67.perform(actionOnItemAtPosition<ViewHolder>(64, click()))

        pressBack()

        val recyclerView68 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView68.perform(actionOnItemAtPosition<ViewHolder>(65, click()))

        pressBack()

        val recyclerView69 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView69.perform(actionOnItemAtPosition<ViewHolder>(66, click()))

        pressBack()

        val recyclerView70 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView70.perform(actionOnItemAtPosition<ViewHolder>(67, click()))

        pressBack()

        val recyclerView71 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView71.perform(actionOnItemAtPosition<ViewHolder>(68, click()))

        pressBack()

        val recyclerView72 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView72.perform(actionOnItemAtPosition<ViewHolder>(69, click()))

        pressBack()

        val recyclerView73 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView73.perform(actionOnItemAtPosition<ViewHolder>(70, click()))

        pressBack()

        val recyclerView74 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView74.perform(actionOnItemAtPosition<ViewHolder>(71, click()))

        pressBack()

        val recyclerView75 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView75.perform(actionOnItemAtPosition<ViewHolder>(71, click()))

        pressBack()

        val recyclerView76 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView76.perform(actionOnItemAtPosition<ViewHolder>(72, click()))

        pressBack()

        val recyclerView77 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView77.perform(actionOnItemAtPosition<ViewHolder>(73, click()))

        pressBack()

        val recyclerView78 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView78.perform(actionOnItemAtPosition<ViewHolder>(74, click()))

        pressBack()

        val recyclerView79 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView79.perform(actionOnItemAtPosition<ViewHolder>(75, click()))

        pressBack()

        val recyclerView80 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView80.perform(actionOnItemAtPosition<ViewHolder>(76, click()))

        pressBack()

        val recyclerView81 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView81.perform(actionOnItemAtPosition<ViewHolder>(77, click()))

        pressBack()

        val recyclerView82 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView82.perform(actionOnItemAtPosition<ViewHolder>(77, click()))

        pressBack()

        val recyclerView83 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView83.perform(actionOnItemAtPosition<ViewHolder>(78, click()))

        pressBack()

        val recyclerView84 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView84.perform(actionOnItemAtPosition<ViewHolder>(79, click()))

        pressBack()

        val recyclerView85 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView85.perform(actionOnItemAtPosition<ViewHolder>(82, click()))

        pressBack()

        val recyclerView86 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView86.perform(actionOnItemAtPosition<ViewHolder>(81, click()))

        pressBack()

        val recyclerView87 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView87.perform(actionOnItemAtPosition<ViewHolder>(80, click()))

        pressBack()

        val recyclerView88 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView88.perform(actionOnItemAtPosition<ViewHolder>(79, click()))

        pressBack()

        val recyclerView89 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView89.perform(actionOnItemAtPosition<ViewHolder>(83, click()))

        pressBack()

        val recyclerView90 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView90.perform(actionOnItemAtPosition<ViewHolder>(84, click()))

        pressBack()

        val recyclerView91 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView91.perform(actionOnItemAtPosition<ViewHolder>(85, click()))

        pressBack()

        val recyclerView92 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView92.perform(actionOnItemAtPosition<ViewHolder>(86, click()))

        pressBack()

        val recyclerView93 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView93.perform(actionOnItemAtPosition<ViewHolder>(87, click()))

        pressBack()

        val recyclerView94 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView94.perform(actionOnItemAtPosition<ViewHolder>(88, click()))

        pressBack()

        val recyclerView95 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView95.perform(actionOnItemAtPosition<ViewHolder>(89, click()))

        pressBack()

        val recyclerView96 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView96.perform(actionOnItemAtPosition<ViewHolder>(90, click()))

        pressBack()

        val recyclerView97 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView97.perform(actionOnItemAtPosition<ViewHolder>(91, click()))

        pressBack()

        val recyclerView98 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView98.perform(actionOnItemAtPosition<ViewHolder>(92, click()))

        pressBack()

        val recyclerView99 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView99.perform(actionOnItemAtPosition<ViewHolder>(93, click()))

        pressBack()

        val recyclerView100 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView100.perform(actionOnItemAtPosition<ViewHolder>(94, click()))

        pressBack()

        val recyclerView101 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView101.perform(actionOnItemAtPosition<ViewHolder>(95, click()))

        pressBack()

        val recyclerView102 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView102.perform(actionOnItemAtPosition<ViewHolder>(96, click()))

        pressBack()

        val recyclerView103 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView103.perform(actionOnItemAtPosition<ViewHolder>(98, click()))

        pressBack()

        val recyclerView104 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView104.perform(actionOnItemAtPosition<ViewHolder>(99, click()))

        pressBack()

        val appCompatEditText4 = onView(
            allOf(
                withId(R.id.idEditText),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText4.perform(replaceText("bitcoin"), closeSoftKeyboard())

        val recyclerView105 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView105.perform(actionOnItemAtPosition<ViewHolder>(0, click()))

        pressBack()

        val recyclerView106 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView106.perform(actionOnItemAtPosition<ViewHolder>(1, click()))

        pressBack()

        val recyclerView107 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView107.perform(actionOnItemAtPosition<ViewHolder>(1, click()))

        pressBack()

        val recyclerView108 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView108.perform(actionOnItemAtPosition<ViewHolder>(2, click()))

        pressBack()

        val recyclerView109 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView109.perform(actionOnItemAtPosition<ViewHolder>(3, click()))

        pressBack()

        val recyclerView110 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView110.perform(actionOnItemAtPosition<ViewHolder>(3, click()))

        pressBack()

        val recyclerView111 = onView(
            allOf(
                withId(R.id.idRVCurrencies),
                childAtPosition(
                    withClassName(`is`("android.widget.RelativeLayout")),
                    0
                )
            )
        )
        recyclerView111.perform(actionOnItemAtPosition<ViewHolder>(0, click()))

        pressBack()

        val appCompatEditText5 = onView(
            allOf(
                withId(R.id.idEditText), withText("bitcoin"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText5.perform(click())

        val appCompatEditText6 = onView(
            allOf(
                withId(R.id.idEditText), withText("bitcoin"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText6.perform(replaceText(""))

        val appCompatEditText7 = onView(
            allOf(
                withId(R.id.idEditText),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText7.perform(closeSoftKeyboard())

        pressBack()

        pressBack()

        pressBack()
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
