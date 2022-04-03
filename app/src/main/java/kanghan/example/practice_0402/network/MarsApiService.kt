package kanghan.example.practice_0402.network

import retrofit2.Retrofit
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    //.addConverterFactory()
    .build()
interface  MarsApiService {
    @GET("realestate")
    suspend fun getProperties(): String
}

object MarsApi {
    val retrofitService : MarsApiService by lazy { retrofit.create(MarsApiService::class.java) }
}