
    @Column(name="{{columnName}}")
    private {{propertiesType}} {{propertiesName}};

    public {{propertiesType}} {{getMethod}}() {
        return this.{{propertiesName}};
    }
    
    public {{propertiesType}} {{setMethod}}({{propertiesType}} {{propertiesName}}) {
        return this.{{propertiesName}} = {{propertiesName}};
    }