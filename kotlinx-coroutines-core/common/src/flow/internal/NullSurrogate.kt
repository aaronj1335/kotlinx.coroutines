/*
 * Copyright 2016-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.flow.internal

import kotlinx.coroutines.internal.*
import kotlin.jvm.*

/**
 * This value is used a a surrogate `null` value when needed.
 * It should never leak to the outside world.
 */
@JvmField
@SharedImmutable
internal val NULL = Symbol("NULL")
