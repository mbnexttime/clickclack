package com.example.clickclack.interfaces

interface OutputInterface {
    fun startRing(id: Int)
    fun endEventById(id: Int)
    fun getUpgoingEvents(): MutableList<Int>
}