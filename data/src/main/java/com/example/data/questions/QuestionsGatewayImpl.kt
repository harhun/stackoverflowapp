package com.example.data.questions

import com.example.data.utils.HttpClientUtils
import io.reactivex.Observable

class QuestionsGatewayImpl(
    private val httpClientUtils: HttpClientUtils
) : QuestionsGateway {

    override fun getQuestions(tagName : String): Observable<QuestionsResponse> {
        return httpClientUtils.instance.getQuestions(tagName)
    }
}