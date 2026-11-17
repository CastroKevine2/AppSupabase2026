package com.uteq.software.appsupabase2026.data

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseManager {

    // Credenciales del proyecto Supabase.
    private const val SUPABASE_URL = "https://ugndmxyrlonvqoqqonab.supabase.co"
    private const val SUPABASE_KEY = "sb_secret_H0G-dDAY7KCQdotZmZZJWw_Vt0y1NQD"

    val client = createSupabaseClient(
        supabaseUrl = SUPABASE_URL,
        supabaseKey = SUPABASE_KEY
    ) {
        install(Postgrest)
    }
}
