class GfG
{
	boolean isBinary(String str)
	{
	  int len=str.length();
	  for(int i=0;i<len;i++)
	  {
	      char ch=str.charAt(i);
	      if(ch!='0'&&ch!='1')
	      {
	          return false;
	      }
	  }
	  return true;
	}
}