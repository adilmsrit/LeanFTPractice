<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>Login_Repo</className>
    <objects>
        <object type="Page" technology="Web">
            <name>noqodi</name>
            <codeName>NoqodiPage_Login</codeName>
            <description></description>
            <identification/>
            <children>
                <object type="EditField" technology="Web">
                    <name>username</name>
                    <codeName>UsernameEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">username</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">text</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>password</name>
                    <codeName>PasswordEditField</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">password</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Type" type="string" isRegExp="false">password</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="Web">
                    <name>                                Login                            </name>
                    <codeName>LoginButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ButtonType" type="string" isRegExp="false">button</property>
                            <property name="Name" type="string" isRegExp="false">                                Login                            </property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
