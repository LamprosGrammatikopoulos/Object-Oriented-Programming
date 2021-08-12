package television;
public class RemoteControl
{
    private boolean powered=false;
    private int channel=0;
    private int volume=0;

    public boolean isOn()
    {
        return powered;
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    public void setpower(int h)
    {
        if(h==1)
        {
            powered=true;
        }
        else if(h==0)
        {
            powered=false;
        }
    }
    public boolean setChannelup()
    {
        if(getChannel()>=0 && getChannel()<100)
        {
            channel=channel+1;
            return true;
        }
        else if(getChannel()==100)
        {
            channel=0;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean setChanneldown()
    {
        if(getChannel()>0 && getChannel()<=100)
        {
            channel=channel-1;
            return true;
        }
        else if(getChannel()==0)
        {
            channel=100;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean setVolumeup()
    {
        if(getVolume()>=0 && getVolume()<50)
        {
            volume=volume+1;
            return true;
        }
        else if(getVolume()==50)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
    public boolean setVolumedown()
    {
        if(getVolume()>0 && getVolume()<=50)
        {
            volume=volume-1;
            return true;
        }
        else if(getVolume()==0)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
}
