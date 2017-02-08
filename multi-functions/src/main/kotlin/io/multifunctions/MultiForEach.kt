package io.multifunctions

import io.multifunctions.models.Hexa
import io.multifunctions.models.Penta
import io.multifunctions.models.Quad

interface MultiForEach {
    fun <A, B> Iterable<Pair<A?, B?>>.forEach(transform: (A?, B?) -> Unit): Unit =
            this.forEach { elem -> transform(elem.first, elem.second) }

    fun <A, B, C> Iterable<Triple<A?, B?, C?>>.forEach(transform: (A?, B?, C?) -> Unit): Unit =
            this.forEach { elem -> transform(elem.first, elem.second, elem.third) }

    fun <A, B, C, D> Iterable<Quad<A?, B?, C?, D?>>.forEach(transform: (A?, B?, C?, D?) -> Unit): Unit =
            this.forEach { elem -> transform(elem.first, elem.second, elem.third, elem.fourth) }

    fun <A, B, C, D, E> Iterable<Penta<A?, B?, C?, D?, E?>>.forEach(transform: (A?, B?, C?, D?, E?) -> Unit): Unit =
            this.forEach { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth) }

    fun <A, B, C, D, E, F> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.forEach(transform: (A?, B?, C?, D?, E?, F?) -> Unit): Unit =
            this.forEach { elem -> transform(elem.first, elem.second, elem.third, elem.fourth, elem.fifth, elem.sixth) }
}