//package com.rajanyadav.springcassandraexample.config;
//
//import java.util.Arrays;
//import java.util.List;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
//import org.springframework.data.cassandra.config.SchemaAction;
//import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
//import org.springframework.data.cassandra.core.cql.keyspace.KeyspaceOption;
//import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
//@Configuration
//@EnableCassandraRepositories(basePackages = "com.*")
//public class CassandraConfig extends AbstractCassandraConfiguration {
//
//  @Override
//  protected String getKeyspaceName() {
//    return "test";
//  }
//
////  @Override
////  protected String getKeyspaceName() {
////    return "hello";
////  }
//
////  @Override
////  protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
////    CreateKeyspaceSpecification specification = CreateKeyspaceSpecification
////        .createKeyspace("hello").ifNotExists()
////        .with(KeyspaceOption.DURABLE_WRITES, true).withSimpleReplication();
////    return Arrays.asList(specification);
////  }
//
//  @Override
//  public SchemaAction getSchemaAction() {
//    return SchemaAction.CREATE_IF_NOT_EXISTS;
//  }
//
////  @Override
////  public String[] getEntityBasePackages() {
////    return new String[]{"com.rajanyadav.springcassandraexample.model.*"};
////  }
//
//  @Override
//  protected int getPort() {
//    return 9042;
//  }
//}