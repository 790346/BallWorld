public class BallWorld
{
    public void start()
    {
        Ballbot area = new Ballbot(1000, 1000);
        Ball[] b = new Ball(5);
        for(int i = 0; i < Ball.length; i++)
        {
            TGPoint tg = new TGPoint(Math.random() * 10 * i, Math.random() * 10 * i);
            b[i] = new BallBot(map, point, 90 * Math.random(), 10);
            b[i].setPixelsPerSecond(100);
        }
        while(true)
        {
            for(int j = 0; j < 100; j++)
            {
                if(b[j].canMoveForward(area))
                {
                    b[j].moveForward();
                }
                else
                {
                    double heading = b[j].getHeading();
                    b[j].setHeading(360.0 * Math.random());
                }
            }
        }
    }
}