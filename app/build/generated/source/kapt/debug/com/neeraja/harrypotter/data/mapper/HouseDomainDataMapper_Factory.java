// Generated by Dagger (https://dagger.dev).
package com.neeraja.harrypotter.data.mapper;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HouseDomainDataMapper_Factory implements Factory<HouseDomainDataMapper> {
  @Override
  public HouseDomainDataMapper get() {
    return newInstance();
  }

  public static HouseDomainDataMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HouseDomainDataMapper newInstance() {
    return new HouseDomainDataMapper();
  }

  private static final class InstanceHolder {
    private static final HouseDomainDataMapper_Factory INSTANCE = new HouseDomainDataMapper_Factory();
  }
}
