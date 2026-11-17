import pandas as pd

def rising_temperature(weather: pd.DataFrame) -> pd.DataFrame:
    weather['recordDate'] = pd.to_datetime(weather['recordDate'])
    df = weather.merge(weather,left_on='recordDate', right_on=weather['recordDate'] 
    + pd.Timedelta(days=1), suffixes=('', '_prev')
    )
    result = df[df['temperature'] > df['temperature_prev']]
    return result[['id']].rename(columns={'id': 'Id'})