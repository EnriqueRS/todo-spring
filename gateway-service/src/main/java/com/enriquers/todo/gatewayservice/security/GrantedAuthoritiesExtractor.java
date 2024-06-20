package com.enriquers.todo.gatewayservice.security;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

class GrantedAuthoritiesExtractor implements Converter<Jwt, Collection<GrantedAuthority>> {

  private static final Logger log = LoggerFactory.getLogger(GrantedAuthoritiesExtractor.class);

  @Override
  public Collection<GrantedAuthority> convert(Jwt jwt) {
    Map<String, Object> claims = jwt.getClaims();
    log.info("Extracting authorities from JWT: {}", claims);
    return Collections.emptyList();
  }
}
