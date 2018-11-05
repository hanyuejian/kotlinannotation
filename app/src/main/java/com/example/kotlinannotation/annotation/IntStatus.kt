package com.example.kotlinannotation.annotation

import android.support.annotation.IntDef

const val FAILED = 0
const val SUCCESS = 1
const val NO_NETWORK = 2

@IntDef(FAILED, SUCCESS, NO_NETWORK)
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class IntStatus


