package ru.xPaw.McPlaceholder;

import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class ConsoleLogFormatter extends Formatter
{
	private SimpleDateFormat a = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
	
	public String format( LogRecord logRecord )
	{
		StringBuilder buffer = new StringBuilder( );
		
		buffer.append( a.format( Long.valueOf( logRecord.getMillis( ) ) ) );
		
		buffer.append( " [" + logRecord.getLevel( ) + "] " );
		buffer.append( logRecord.getMessage( ) + '\n' );
		
		return buffer.toString( );
	}
}
