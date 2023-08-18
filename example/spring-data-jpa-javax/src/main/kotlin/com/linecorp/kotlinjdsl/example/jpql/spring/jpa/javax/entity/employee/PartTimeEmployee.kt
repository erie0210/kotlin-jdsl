package com.linecorp.kotlinjdsl.example.jpql.spring.jpa.javax.entity.employee

import javax.persistence.*

@Entity
@DiscriminatorValue("PART_TIME")
class PartTimeEmployee(
    employeeId: Long,

    name: String,

    nickname: String?,

    phone: String,

    address: EmployeeAddress,

    departments: MutableSet<EmployeeDepartment>,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "weekly_salary"))
    val weeklySalary: EmployeeSalary,
) : Employee(
    employeeId = employeeId,
    name = name,
    nickname = nickname,
    phone = phone,
    address = address,
    departments = departments,
)