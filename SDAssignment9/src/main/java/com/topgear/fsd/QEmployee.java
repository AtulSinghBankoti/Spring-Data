package com.topgear.fsd;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmployee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployee extends EntityPathBase<Employee> {

    private static final long serialVersionUID = -1956288196L;

    public static final QEmployee employee = new QEmployee("employee");

    public final DatePath<java.util.Date> empDoj = createDate("empDoj", java.util.Date.class);

    public final NumberPath<Long> empId = createNumber("empId", Long.class);

    public final StringPath employeeType = createString("employeeType");

    public final StringPath empName = createString("empName");

    public final NumberPath<Float> empTotalSalary = createNumber("empTotalSalary", Float.class);

    public QEmployee(String variable) {
        super(Employee.class, forVariable(variable));
    }

    public QEmployee(Path<? extends Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployee(PathMetadata metadata) {
        super(Employee.class, metadata);
    }

}

