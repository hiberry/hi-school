#!/usr/bin/env bash

JDBC_HOST="127.0.0.1"
JDBC_POST="3306"
JDBC_DATABASE="hi-school"
JDBC_USERNAME="root"
JDBC_PASSWORD="1234"

function input() {

  read -p "input jdbc.host[default:$JDBC_HOST]:" INPUT_JDBC_HOST
  read -p "input jdbc.port[default:$JDBC_POST]:" INPUT_JDBC_POST
  read -p "input jdbc.database[default:$JDBC_DATABASE]:" INPUT_JDBC_DATABASE
  read -p "input jdbc.username[default:$JDBC_USERNAME]:" INPUT_JDBC_USERNAME
  read -p "input jdbc.password[default:$JDBC_PASSWORD]:" INPUT_JDBC_PASSWORD

  if [ -n "$INPUT_JDBC_HOST" ]; then
    JDBC_HOST=$INPUT_JDBC_HOST
  fi
  if [ -n "$INPUT_JDBC_POST" ]; then
    JDBC_POST=$INPUT_JDBC_POST
  fi
  if [ -n "$INPUT_JDBC_DATABASE" ]; then
    JDBC_DATABASE=$INPUT_JDBC_DATABASE
  fi
  if [ -n "$INPUT_JDBC_USERNAME" ]; then
    JDBC_USERNAME=$INPUT_JDBC_USERNAME
  fi
  if [ -n "$INPUT_JDBC_PASSWORD" ]; then
    JDBC_PASSWORD=$INPUT_JDBC_PASSWORD
  fi
}

function execute() {
  input

  MVN_D_ARGS="-pl hi-school-infrastructure"
  MVN_D_ARGS="$MVN_D_ARGS -Djdbc.host=$JDBC_HOST -Djdbc.port=$JDBC_POST -Djdbc.database=$JDBC_DATABASE -Djdbc.username=$JDBC_USERNAME -Djdbc.password=$JDBC_PASSWORD"

  cmd="mvn mybatis-generator:generate $MVN_D_ARGS"
  echo $cmd

  exec $cmd
}

execute
