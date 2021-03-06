package io.multifunctions

import io.multifunctions.models.*

inline fun <A, B, R : Any> Iterable<Pair<A?, B?>>.mapNotNull(transform: (A, B) -> R): List<R> =
        this.mapNotNull { (first, second) ->
            when (null) {
                first, second -> null
                else -> transform(first, second)
            }
        }

inline fun <A, B, C, R : Any> Iterable<Triple<A?, B?, C?>>.mapNotNull(transform: (A, B, C) -> R): List<R> =
        this.mapNotNull { (first, second, third) ->
            when (null) {
                first, second, third -> null
                else -> transform(first, second, third)
            }
        }

inline fun <A, B, C, D, R : Any> Iterable<Quad<A?, B?, C?, D?>>.mapNotNull(transform: (A, B, C, D) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth) ->
            when (null) {
                first, second, third, fourth -> null
                else -> transform(first, second, third, fourth)
            }
        }

inline fun <A, B, C, D, E, R : Any> Iterable<Penta<A?, B?, C?, D?, E?>>.mapNotNull(transform: (A, B, C, D, E) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth) ->
            when (null) {
                first, second, third, fourth, fifth -> null
                else -> transform(first, second, third, fourth, fifth)
            }
        }

inline fun <A, B, C, D, E, F, R : Any> Iterable<Hexa<A?, B?, C?, D?, E?, F?>>.mapNotNull(transform: (A, B, C, D, E, F) -> R): List<R> =
        this.mapNotNull { (first, second, third, fourth, fifth, sixth) ->
            when (null) {
                first, second, third, fourth, fifth, sixth -> null
                else -> transform(first, second, third, fourth, fifth, sixth)
            }
        }