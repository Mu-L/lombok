import java.util.Map;
import java.util.SortedMap;
import lombok.Singular;
@lombok.Builder(setterPrefix = "with") class BuilderSingularMapsWithSetterPrefix<K, V> {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class BuilderSingularMapsWithSetterPrefixBuilder<K, V> {
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<K> women$key;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<V> women$value;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<K> men$key;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<Number> men$value;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<java.lang.Object> rawMap$key;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<java.lang.Object> rawMap$value;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<String> stringMap$key;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<V> stringMap$value;
    @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefixBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withWoman(final K womanKey, final V womanValue) {
      if ((this.women$key == null))
          {
            this.women$key = new java.util.ArrayList<K>();
            this.women$value = new java.util.ArrayList<V>();
          }
      this.women$key.add(womanKey);
      this.women$value.add(womanValue);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withWomen(final java.util.Map<? extends K, ? extends V> women) {
      if ((women == null))
          {
            throw new java.lang.NullPointerException("women cannot be null");
          }
      if ((this.women$key == null))
          {
            this.women$key = new java.util.ArrayList<K>();
            this.women$value = new java.util.ArrayList<V>();
          }
      for (java.util.Map.Entry<? extends K, ? extends V> $lombokEntry : women.entrySet()) 
        {
          this.women$key.add($lombokEntry.getKey());
          this.women$value.add($lombokEntry.getValue());
        }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> clearWomen() {
      if ((this.women$key != null))
          {
            this.women$key.clear();
            this.women$value.clear();
          }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withMan(final K manKey, final Number manValue) {
      if ((this.men$key == null))
          {
            this.men$key = new java.util.ArrayList<K>();
            this.men$value = new java.util.ArrayList<Number>();
          }
      this.men$key.add(manKey);
      this.men$value.add(manValue);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withMen(final java.util.Map<? extends K, ? extends Number> men) {
      if ((men == null))
          {
            throw new java.lang.NullPointerException("men cannot be null");
          }
      if ((this.men$key == null))
          {
            this.men$key = new java.util.ArrayList<K>();
            this.men$value = new java.util.ArrayList<Number>();
          }
      for (java.util.Map.Entry<? extends K, ? extends Number> $lombokEntry : men.entrySet()) 
        {
          this.men$key.add($lombokEntry.getKey());
          this.men$value.add($lombokEntry.getValue());
        }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> clearMen() {
      if ((this.men$key != null))
          {
            this.men$key.clear();
            this.men$value.clear();
          }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withRawMap(final java.lang.Object rawMapKey, final java.lang.Object rawMapValue) {
      if ((this.rawMap$key == null))
          {
            this.rawMap$key = new java.util.ArrayList<java.lang.Object>();
            this.rawMap$value = new java.util.ArrayList<java.lang.Object>();
          }
      this.rawMap$key.add(rawMapKey);
      this.rawMap$value.add(rawMapValue);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withRawMap(final java.util.Map<?, ?> rawMap) {
      if ((rawMap != null))
          {
            if ((this.rawMap$key == null))
                {
                  this.rawMap$key = new java.util.ArrayList<java.lang.Object>();
                  this.rawMap$value = new java.util.ArrayList<java.lang.Object>();
                }
            for (java.util.Map.Entry<?, ?> $lombokEntry : rawMap.entrySet()) 
              {
                this.rawMap$key.add($lombokEntry.getKey());
                this.rawMap$value.add($lombokEntry.getValue());
              }
          }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> clearRawMap() {
      if ((this.rawMap$key != null))
          {
            this.rawMap$key.clear();
            this.rawMap$value.clear();
          }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withStringMap(final String stringMapKey, final V stringMapValue) {
      if ((this.stringMap$key == null))
          {
            this.stringMap$key = new java.util.ArrayList<String>();
            this.stringMap$value = new java.util.ArrayList<V>();
          }
      this.stringMap$key.add(stringMapKey);
      this.stringMap$value.add(stringMapValue);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> withStringMap(final java.util.Map<? extends String, ? extends V> stringMap) {
      if ((stringMap == null))
          {
            throw new java.lang.NullPointerException("stringMap cannot be null");
          }
      if ((this.stringMap$key == null))
          {
            this.stringMap$key = new java.util.ArrayList<String>();
            this.stringMap$value = new java.util.ArrayList<V>();
          }
      for (java.util.Map.Entry<? extends String, ? extends V> $lombokEntry : stringMap.entrySet()) 
        {
          this.stringMap$key.add($lombokEntry.getKey());
          this.stringMap$value.add($lombokEntry.getValue());
        }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> clearStringMap() {
      if ((this.stringMap$key != null))
          {
            this.stringMap$key.clear();
            this.stringMap$value.clear();
          }
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix<K, V> build() {
      java.util.Map<K, V> women;
      switch (((this.women$key == null) ? 0 : this.women$key.size())) {
      case 0 :
          women = java.util.Collections.emptyMap();
          break;
      case 1 :
          women = java.util.Collections.singletonMap(this.women$key.get(0), this.women$value.get(0));
          break;
      default :
          women = new java.util.LinkedHashMap<K, V>(((this.women$key.size() < 0x40000000) ? ((1 + this.women$key.size()) + ((this.women$key.size() - 3) / 3)) : java.lang.Integer.MAX_VALUE));
          for (int $i = 0;; ($i < this.women$key.size()); $i ++) 
            women.put(this.women$key.get($i), this.women$value.get($i));
          women = java.util.Collections.unmodifiableMap(women);
      }
      java.util.SortedMap<K, Number> men = new java.util.TreeMap<K, Number>();
      if ((this.men$key != null))
          for (int $i = 0;; ($i < ((this.men$key == null) ? 0 : this.men$key.size())); $i ++) 
            men.put(this.men$key.get($i), this.men$value.get($i));
      men = java.util.Collections.unmodifiableSortedMap(men);
      java.util.Map<java.lang.Object, java.lang.Object> rawMap;
      switch (((this.rawMap$key == null) ? 0 : this.rawMap$key.size())) {
      case 0 :
          rawMap = java.util.Collections.emptyMap();
          break;
      case 1 :
          rawMap = java.util.Collections.singletonMap(this.rawMap$key.get(0), this.rawMap$value.get(0));
          break;
      default :
          rawMap = new java.util.LinkedHashMap<java.lang.Object, java.lang.Object>(((this.rawMap$key.size() < 0x40000000) ? ((1 + this.rawMap$key.size()) + ((this.rawMap$key.size() - 3) / 3)) : java.lang.Integer.MAX_VALUE));
          for (int $i = 0;; ($i < this.rawMap$key.size()); $i ++) 
            rawMap.put(this.rawMap$key.get($i), this.rawMap$value.get($i));
          rawMap = java.util.Collections.unmodifiableMap(rawMap);
      }
      java.util.Map<String, V> stringMap;
      switch (((this.stringMap$key == null) ? 0 : this.stringMap$key.size())) {
      case 0 :
          stringMap = java.util.Collections.emptyMap();
          break;
      case 1 :
          stringMap = java.util.Collections.singletonMap(this.stringMap$key.get(0), this.stringMap$value.get(0));
          break;
      default :
          stringMap = new java.util.LinkedHashMap<String, V>(((this.stringMap$key.size() < 0x40000000) ? ((1 + this.stringMap$key.size()) + ((this.stringMap$key.size() - 3) / 3)) : java.lang.Integer.MAX_VALUE));
          for (int $i = 0;; ($i < this.stringMap$key.size()); $i ++) 
            stringMap.put(this.stringMap$key.get($i), this.stringMap$value.get($i));
          stringMap = java.util.Collections.unmodifiableMap(stringMap);
      }
      return new BuilderSingularMapsWithSetterPrefix<K, V>(women, men, rawMap, stringMap);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (((((((((((((((("BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder(women$key=" + this.women$key) + ", women$value=") + this.women$value) + ", men$key=") + this.men$key) + ", men$value=") + this.men$value) + ", rawMap$key=") + this.rawMap$key) + ", rawMap$value=") + this.rawMap$value) + ", stringMap$key=") + this.stringMap$key) + ", stringMap$value=") + this.stringMap$value) + ")");
    }
  }
  private @Singular Map<K, V> women;
  private @Singular SortedMap<K, ? extends Number> men;
  private @SuppressWarnings("all") @Singular(value = "rawMap",ignoreNullCollections = true) Map rawMap;
  private @Singular("stringMap") Map<String, V> stringMap;
  @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularMapsWithSetterPrefix(final Map<K, V> women, final SortedMap<K, ? extends Number> men, final Map rawMap, final Map<String, V> stringMap) {
    super();
    this.women = women;
    this.men = men;
    this.rawMap = rawMap;
    this.stringMap = stringMap;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated <K, V>BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V> builder() {
    return new BuilderSingularMapsWithSetterPrefix.BuilderSingularMapsWithSetterPrefixBuilder<K, V>();
  }
}
