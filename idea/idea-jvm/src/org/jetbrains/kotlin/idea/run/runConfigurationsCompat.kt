/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("IncompatibleAPI")

package org.jetbrains.kotlin.idea.run

import com.intellij.execution.configurations.ModuleBasedConfiguration
import com.intellij.execution.configurations.RunConfigurationBase
import org.jdom.Element

// Generalized in 191
// BUNCH: 191
typealias RunConfigurationBaseAny = RunConfigurationBase

// Generalized in 191
// BUNCH: 191
typealias ModuleBasedConfigurationAny = ModuleBasedConfiguration<*>

// Generalized in 191
// BUNCH: 191
typealias ModuleBasedConfigurationElement<T> = ModuleBasedConfiguration<T>