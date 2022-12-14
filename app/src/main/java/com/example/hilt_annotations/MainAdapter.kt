package com.example.hilt_annotations

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainAdapter @Inject constructor(
    private val mainService: MainService
) { }