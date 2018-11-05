package com.example.kotlinannotation.annotation

import android.support.annotation.StringDef

const val NORMAL = "normal"
const val GOOD = "good"
const val EXCELLENT = "excellent"

@StringDef(NORMAL, GOOD, EXCELLENT)
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class StringStatus


