package com.linecorp.kotlinjdsl.dsl.sql.insert

import com.linecorp.kotlinjdsl.query.sql.Expression
import com.linecorp.kotlinjdsl.query.sql.InsertQuery
import com.linecorp.kotlinjdsl.query.sql.SqlQueryable

interface InsertQueryValueStep7<T : Any, V1, V2, V3, V4, V5, V6, V7> :
    InsertQuerySelectStep<T>,
    SqlQueryable<InsertQuery<T>> {

    fun values(
        value1: V1,
        value2: V2,
        value3: V3,
        value4: V4,
        value5: V5,
        value6: V6,
        value7: V7,
    ): InsertQueryValueStep7<T, V1, V2, V3, V4, V5, V6, V7>

    fun values(
        value1: Expression<V1>,
        value2: Expression<V2>,
        value3: Expression<V3>,
        value4: Expression<V4>,
        value5: Expression<V5>,
        value6: Expression<V6>,
        value7: Expression<V7>,
    ): InsertQueryValueStep7<T, V1, V2, V3, V4, V5, V6, V7>

    fun values(
        values: Collection<Expression<*>>,
    ): InsertQueryValueStep7<T, V1, V2, V3, V4, V5, V6, V7>
}