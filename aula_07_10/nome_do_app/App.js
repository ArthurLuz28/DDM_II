import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from 'react-navigation/native-stack';

import Login from './screens/login/Login';
import Home from './screens/home/Home';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigation
        screenOptions={{
          headerShown: false,
        }}
      >
        <Stack.screen
          nome="Login"
          component={Login}
          // options={{
          //  headerShown: false,
          // }}
        />

        <Stack.screen
          name="Home"
          component={Home}
        />
    </NavigationContainer>
  );
}