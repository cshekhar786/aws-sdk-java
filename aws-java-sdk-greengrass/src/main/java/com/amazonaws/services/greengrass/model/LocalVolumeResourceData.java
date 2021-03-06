/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Attributes that define a local volume resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/LocalVolumeResourceData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalVolumeResourceData implements Serializable, Cloneable, StructuredPojo {

    /** The absolute local path of the resource inside the lambda environment. */
    private String destinationPath;
    /** Allows you to configure additional group privileges for the Lambda process. This field is optional. */
    private GroupOwnerSetting groupOwnerSetting;
    /**
     * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot
     * start with ''/proc'' or ''/sys''.
     */
    private String sourcePath;

    /**
     * The absolute local path of the resource inside the lambda environment.
     * 
     * @param destinationPath
     *        The absolute local path of the resource inside the lambda environment.
     */

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    /**
     * The absolute local path of the resource inside the lambda environment.
     * 
     * @return The absolute local path of the resource inside the lambda environment.
     */

    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * The absolute local path of the resource inside the lambda environment.
     * 
     * @param destinationPath
     *        The absolute local path of the resource inside the lambda environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalVolumeResourceData withDestinationPath(String destinationPath) {
        setDestinationPath(destinationPath);
        return this;
    }

    /**
     * Allows you to configure additional group privileges for the Lambda process. This field is optional.
     * 
     * @param groupOwnerSetting
     *        Allows you to configure additional group privileges for the Lambda process. This field is optional.
     */

    public void setGroupOwnerSetting(GroupOwnerSetting groupOwnerSetting) {
        this.groupOwnerSetting = groupOwnerSetting;
    }

    /**
     * Allows you to configure additional group privileges for the Lambda process. This field is optional.
     * 
     * @return Allows you to configure additional group privileges for the Lambda process. This field is optional.
     */

    public GroupOwnerSetting getGroupOwnerSetting() {
        return this.groupOwnerSetting;
    }

    /**
     * Allows you to configure additional group privileges for the Lambda process. This field is optional.
     * 
     * @param groupOwnerSetting
     *        Allows you to configure additional group privileges for the Lambda process. This field is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalVolumeResourceData withGroupOwnerSetting(GroupOwnerSetting groupOwnerSetting) {
        setGroupOwnerSetting(groupOwnerSetting);
        return this;
    }

    /**
     * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot
     * start with ''/proc'' or ''/sys''.
     * 
     * @param sourcePath
     *        The local absolute path of the volume resource on the host. The source path for a volume resource type
     *        cannot start with ''/proc'' or ''/sys''.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot
     * start with ''/proc'' or ''/sys''.
     * 
     * @return The local absolute path of the volume resource on the host. The source path for a volume resource type
     *         cannot start with ''/proc'' or ''/sys''.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot
     * start with ''/proc'' or ''/sys''.
     * 
     * @param sourcePath
     *        The local absolute path of the volume resource on the host. The source path for a volume resource type
     *        cannot start with ''/proc'' or ''/sys''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalVolumeResourceData withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDestinationPath() != null)
            sb.append("DestinationPath: ").append(getDestinationPath()).append(",");
        if (getGroupOwnerSetting() != null)
            sb.append("GroupOwnerSetting: ").append(getGroupOwnerSetting()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalVolumeResourceData == false)
            return false;
        LocalVolumeResourceData other = (LocalVolumeResourceData) obj;
        if (other.getDestinationPath() == null ^ this.getDestinationPath() == null)
            return false;
        if (other.getDestinationPath() != null && other.getDestinationPath().equals(this.getDestinationPath()) == false)
            return false;
        if (other.getGroupOwnerSetting() == null ^ this.getGroupOwnerSetting() == null)
            return false;
        if (other.getGroupOwnerSetting() != null && other.getGroupOwnerSetting().equals(this.getGroupOwnerSetting()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPath() == null) ? 0 : getDestinationPath().hashCode());
        hashCode = prime * hashCode + ((getGroupOwnerSetting() == null) ? 0 : getGroupOwnerSetting().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        return hashCode;
    }

    @Override
    public LocalVolumeResourceData clone() {
        try {
            return (LocalVolumeResourceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.LocalVolumeResourceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
