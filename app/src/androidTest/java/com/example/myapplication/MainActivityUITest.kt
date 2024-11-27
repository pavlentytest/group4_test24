package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityUITest {

    @get:Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUI() {
        onView(withId(R.id.editLogin)).check(matches(isDisplayed()))
        onView(withId(R.id.editPassword)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.textResult)).check(matches(isDisplayed()))
        onView(withId(R.id.editLogin)).perform(typeText("login123"), closeSoftKeyboard())
        onView(withId(R.id.editPassword)).perform(typeText("123123"), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textResult)).check(matches(withText(R.string.failed)))
    }
}