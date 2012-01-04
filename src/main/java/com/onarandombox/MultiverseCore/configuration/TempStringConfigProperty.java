/******************************************************************************
 * Multiverse 2 Copyright (c) the Multiverse Team 2012.                       *
 * Multiverse 2 is licensed under the BSD License.                            *
 * For more information please check the README.md file included              *
 * with this project.                                                         *
 ******************************************************************************/

package com.onarandombox.MultiverseCore.configuration;

/**
 * A {@link String} config-property that will NOT be saved to the config.
 */
public class TempStringConfigProperty implements MVConfigProperty<String> {
    private String name;
    private String value;
    private String method;
    private String help;

    public TempStringConfigProperty(String name, String defaultValue, String help) {
        this.name = name;
        this.help = help;
        this.value = defaultValue;
        this.parseValue(defaultValue);
    }

    public TempStringConfigProperty(String name, String defaultValue, String help, String method) {
        this(name, defaultValue, help);
        this.method = method;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getValue() {
        return this.value;
    }

    /**
     * Gets the method used to set this {@link TempStringConfigProperty}.
     * @return The name of that method.
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean parseValue(String value) {
        if (value == null) {
            return false;
        }
        this.setValue(value);
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getConfigNode() {
        return "";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHelp() {
        return this.help;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean setValue(String value) {
        if (value == null) {
            return false;
        }
        this.value = value;
        return true;
    }

    @Override
    public String toString() {
        return value;
    }
}
