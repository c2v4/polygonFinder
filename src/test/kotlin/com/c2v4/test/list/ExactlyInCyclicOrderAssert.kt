package com.c2v4.test.list

import org.assertj.core.api.Condition
import java.util.*
import java.util.function.Predicate


fun exactlyInCyclicOrder(expected: List<Any>) = Condition<List<Any>>(
        Predicate { actual -> Collections.indexOfSubList((expected + expected), actual) != -1 }, ""
)