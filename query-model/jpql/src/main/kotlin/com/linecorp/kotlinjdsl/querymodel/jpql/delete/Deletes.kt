package com.linecorp.kotlinjdsl.querymodel.jpql.delete

import com.linecorp.kotlinjdsl.SinceJdsl
import com.linecorp.kotlinjdsl.querymodel.jpql.delete.impl.JpqlDeleteQuery
import com.linecorp.kotlinjdsl.querymodel.jpql.entity.Entity
import com.linecorp.kotlinjdsl.querymodel.jpql.predicate.Predicate

object Deletes {
    @SinceJdsl("3.0.0")
    fun <T : Any> delete(
        entity: Entity<T>,
        where: Predicate?,
    ): DeleteQuery<T> {
        return JpqlDeleteQuery(
            entity = entity,
            where = where,
        )
    }
}