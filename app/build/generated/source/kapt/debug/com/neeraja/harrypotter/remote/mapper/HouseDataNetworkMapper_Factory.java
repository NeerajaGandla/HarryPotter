// Generated by Dagger (https://dagger.dev).
package com.neeraja.harrypotter.remote.mapper;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HouseDataNetworkMapper_Factory implements Factory<HouseDataNetworkMapper> {
  @Override
  public HouseDataNetworkMapper get() {
    return newInstance();
  }

  public static HouseDataNetworkMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HouseDataNetworkMapper newInstance() {
    return new HouseDataNetworkMapper();
  }

  private static final class InstanceHolder {
    private static final HouseDataNetworkMapper_Factory INSTANCE = new HouseDataNetworkMapper_Factory();
  }
}
