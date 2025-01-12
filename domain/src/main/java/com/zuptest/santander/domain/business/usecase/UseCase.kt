package com.zuptest.santander.domain.business.usecase

import io.reactivex.Observable

abstract class UseCase {

    interface WithParameter<in P, R> {
        fun execute(params: P): Observable<R>
    }

    interface WithoutParameter<R> {
        fun execute(): Observable<R>
    }

    interface Completable<P> {
        fun execute(params: P): io.reactivex.Completable
    }

}