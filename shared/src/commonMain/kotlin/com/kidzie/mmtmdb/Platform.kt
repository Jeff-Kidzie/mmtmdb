package com.kidzie.mmtmdb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform