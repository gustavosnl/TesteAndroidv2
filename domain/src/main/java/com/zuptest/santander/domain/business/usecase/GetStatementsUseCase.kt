package com.zuptest.santander.domain.business.usecase

import com.zuptest.santander.domain.business.model.Statement

interface GetStatementsUseCase : UseCase.WithParameter<String, List<Statement>>